package firefist.wei.main;

import java.io.IOException; 
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import firefist.wei.main.result.HomeResult;
import firefist.wei.utils.PhotoUtil;

import android.app.Application;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

/**
 * 存放共有的数据
 * 
 * @author firefist_wei
 * 
 */


public class KXApplication extends Application {

	/**
	 * 默认壁纸
	 */
	public Bitmap mDefault_Wallpager;
	/**
	 * 默认标题壁纸
	 */
	public Bitmap mDefault_TitleWallpager;
	/**
	 * 默认头像
	 */
	public Bitmap mDefault_Avatar;
	/**
	 * 默认照片
	 */
	public Bitmap mDefault_Photo;
	/**
	 * 壁纸缓存
	 */
	public HashMap<String, SoftReference<Bitmap>> mWallpagersCache = new HashMap<String, SoftReference<Bitmap>>();
	/**
	 * 壁纸名称
	 */
	public String[] mWallpagersName;
	/**
	 * 标题壁纸缓存
	 */
	public HashMap<String, SoftReference<Bitmap>> mTitleWallpagersCache = new HashMap<String, SoftReference<Bitmap>>();
	/**
	 * 标题壁纸名称
	 */
	public String[] mTitleWallpagersName;
	/**
	 * 当前壁纸编号
	 */
	public int mWallpagerPosition = 0;
	/**
	 * 圆形头像缓存
	 */
	public HashMap<String, SoftReference<Bitmap>> mAvatarCache = new HashMap<String, SoftReference<Bitmap>>();
	/**
	 * 默认头像缓存
	 */
	public HashMap<String, SoftReference<Bitmap>> mDefaultAvatarCache = new HashMap<String, SoftReference<Bitmap>>();
	/**
	 * 头像名称
	 */
	public String[] mAvatars = {"f1","f2","f3","f4","f5","f6","f7","f8","f9","f10","f11","f12","f13","f14","f15","f16"
			,"f17","f18","f19"};
	/**
	 * 公共主页头像缓存
	 */
	public HashMap<String, SoftReference<Bitmap>> mPublicPageAvatarCache = new HashMap<String, SoftReference<Bitmap>>();
	/**
	 * 公共主页头像名称
	 */
	public String[] mPublicPageAvatars;
	/**
	 * 表情
	 */
	public int[] mFaces = { };
	/**
	 * 表情名称
	 */
	public List<String> mFacesText = new ArrayList<String>();
	/**
	 * 表情缓存
	 */
	public HashMap<String, SoftReference<Bitmap>> mFaceCache = new HashMap<String, SoftReference<Bitmap>>();
	/**
	 * 照片缓存
	 */
	public HashMap<String, SoftReference<Bitmap>> mPhotoCache = new HashMap<String, SoftReference<Bitmap>>();
	/**
	 * 照片名称
	 */
	public String[] mPhotosName;
	/**
	 * 转帖图片缓存
	 */
	public HashMap<String, SoftReference<Bitmap>> mViewedCache = new HashMap<String, SoftReference<Bitmap>>();
	/**
	 * 转帖图片名称
	 */
	public String[] mViewedName;
	/**
	 * 热门转帖图片缓存
	 */
	public HashMap<String, SoftReference<Bitmap>> mViewedHotCache = new HashMap<String, SoftReference<Bitmap>>();
	/**
	 * 热门转帖图片名称
	 */
	public String[] mViewedHotName;
	/**
	 * 游戏图片缓存
	 */
	public HashMap<String, SoftReference<Bitmap>> mRecommendCache = new HashMap<String, SoftReference<Bitmap>>();
	/**
	 * 附近照片缓存
	 */
	public HashMap<String, SoftReference<Bitmap>> mNearbyPhoto = new HashMap<String, SoftReference<Bitmap>>();
	/**
	 * 主页图片缓存
	 */
	public HashMap<String, SoftReference<Bitmap>> mHomeCache = new HashMap<String, SoftReference<Bitmap>>();
	/**
	 * 手机SD卡图片缓存
	 */
	public HashMap<String, SoftReference<Bitmap>> mPhoneAlbumCache = new HashMap<String, SoftReference<Bitmap>>();
	/**
	 * 手机SD卡图片的路径
	 */
	public Map<String, List<Map<String, String>>> mPhoneAlbum = new HashMap<String, List<Map<String, String>>>();

	/**
	 * 当期用户首页数据
	 */
	public static List<HomeResult> mMyHomeResults = new ArrayList<HomeResult>();
	/**
	 * 当前用户的资料数据
	 *//*
	public FriendInfoResult mMyInfoResult;

	*//**
	 * 当前用户的来访数据
	 *//*
	public List<VisitorsResult> mMyVisitorsResults = new ArrayList<VisitorsResult>();
	*//**
	 * 当前用户的状态数据
	 *//*
	public List<StatusResult> mMyStatusResults = new ArrayList<StatusResult>();
	*//**
	 * 当前用户的相册数据
	 *//*
	public List<PhotoResult> mMyPhotoResults = new ArrayList<PhotoResult>();
	*//**
	 * 当前用户的日记数据
	 *//*
	public List<DiaryResult> mMyDiaryResults = new ArrayList<DiaryResult>();
	*//**
	 * 当前用户的好友数据
	 *//*
	public List<FriendsResult> mMyFriendsResults = new ArrayList<FriendsResult>();
	*//**
	 * 当前用户的好友根据姓名首字母分组
	 *//*
	public Map<String, List<FriendsResult>> mMyFriendsGroupByFirstName = new HashMap<String, List<FriendsResult>>();*/
	/**
	 * 当前用户的好友的姓名首字母在列表中的位置
	 */
	public Map<String, Integer> mMyFriendsFirstNamePosition = new HashMap<String, Integer>();
	/**
	 * 当前用户的好友的姓名的首字母数据
	 */
	public List<String> mMyFriendsFirstName = new ArrayList<String>();
	/**
	 * 当前用户的好友的姓名的首字母的在列表中的位置
	 */
	public List<Integer> mMyFriendsPosition = new ArrayList<Integer>();

	/**
	 * 当前用户的公共主页数据
	 */
	/*public List<PublicPageResult> mMyPublicPageResults = new ArrayList<PublicPageResult>();
	*//**
	 * 当前用户的公共主页根据姓名首字母分组
	 *//*
	public Map<String, List<PublicPageResult>> mMyPublicPageGroupByFirstName = new HashMap<String, List<PublicPageResult>>();

	*//**
	 * 当前用户的好友转帖数据
	 *//*
	public List<ViewedResult> mMyViewedResults = new ArrayList<ViewedResult>();

	*//**
	 * 当前用户的热门转帖数据
	 *//*
	public List<ViewedResult> mViewedHotResults = new ArrayList<ViewedResult>();

	*//**
	 * 当前用户的最近过生日好友数据
	 *//*
	public List<FriendsBirthdayResult> mMyFriendsBirthdayResults = new ArrayList<FriendsBirthdayResult>();

	*//**
	 * 当前用户的推荐官方模块数据
	 *//*
	public List<RecommendResult> mMyRecommendOfficialResults = new ArrayList<RecommendResult>();
	*//**
	 * 当前用户的推荐应用下载数据
	 *//*
	public List<RecommendResult> mMyRecommendAppDownLoadResults = new ArrayList<RecommendResult>();

	*//**
	 * 当前用户的附近的人数据
	 *//*
	public List<NearbyPeopleResult> mMyNearByPeopleResults = new ArrayList<NearbyPeopleResult>();

	*//**
	 * 当前用户的附近的照片数据
	 *//*
	public List<NearbyPhotoResult> mMyNearbyPhotoResults = new ArrayList<NearbyPhotoResult>();

	*//**
	 * 当前用户的地理位置数据
	 *//*
	public List<LocationResult> mMyLocationResults = new ArrayList<LocationResult>();

	*//**
	 * 所有好友的资料数据 (Key对应该好友的uid)
	 *//*
	public Map<String, FriendInfoResult> mFriendInfoResults = new HashMap<String, FriendInfoResult>();

	*//**
	 * 所有好友的来访数据 (Key对应该好友的uid)
	 *//*
	public Map<String, List<VisitorsResult>> mFriendVisitorsResults = new HashMap<String, List<VisitorsResult>>();

	*//**
	 * 所有好友的状态数据 (Key对应该好友的uid)
	 *//*
	public Map<String, List<StatusResult>> mFriendStatusResults = new HashMap<String, List<StatusResult>>();

	*//**
	 * 所有好友的相册数据 (Key对应该好友的uid)
	 *//*
	public Map<String, List<PhotoResult>> mFriendPhotoResults = new HashMap<String, List<PhotoResult>>();

	*//**
	 * 所有好友的日记数据 (Key对应该好友的uid)
	 *//*
	public Map<String, List<DiaryResult>> mFriendDiaryResults = new HashMap<String, List<DiaryResult>>();

	*//**
	 * 所有好友的好友数据 (Key对应该好友的uid)
	 *//*
	public Map<String, List<FriendsResult>> mFriendFriendsResults = new HashMap<String, List<FriendsResult>>();

	*//**
	 * 存放聊天记录
	 *//*
	public List<ChatResult> mChatResults = new ArrayList<ChatResult>();*/

	/**
	 * 存放赠送礼物的好友
	 */
	public Map<String, Map<String, String>> mGiftFriendsList = new HashMap<String, Map<String, String>>();

	/**
	 * 存放礼物图片
	 */
	public HashMap<String, SoftReference<Bitmap>> mGiftsCache = new HashMap<String, SoftReference<Bitmap>>();

	public String[] mGiftsName;
	/**
	 * 存放礼物的具体信息
	 */
//	public List<GiftResult> mGiftResults = new ArrayList<GiftResult>();

	/**
	 * 存放存为草稿的日记标题
	 */
	public String mDraft_DiaryTitle;
	/**
	 * 存放存为草稿的日记内容
	 */
	public String mDraft_DiaryContent;

	/**
	 * 存放拍照上传的照片路径
	 */
	public String mUploadPhotoPath;
	/**
	 * 存放本地选取的照片集合
	 */
	public List<Map<String, String>> mAlbumList = new ArrayList<Map<String, String>>();

	public void onCreate() {
		super.onCreate();
		/**
		 * 初始化默认数据
		 */
		mDefault_Wallpager = BitmapFactory.decodeResource(getResources(),
				R.drawable.cover);
		mDefault_TitleWallpager = BitmapFactory.decodeResource(getResources(),
				R.drawable.cover_title);
		mDefault_Photo = BitmapFactory.decodeResource(getResources(),
				R.drawable.photo);
		mDefault_Avatar = PhotoUtil.toRoundCorner(
				BitmapFactory.decodeResource(getResources(), R.drawable.head),
				15);
		mWallpagerPosition = (int) (Math.random() * 12);
		/**
		 * 初始化所有的数据信息
		 */
/*		try {
			mWallpagersName = getAssets().list("wallpaper");
			mTitleWallpagersName = getAssets().list("title_wallpager");
			mAvatars = getAssets().list("avatar");
			mPublicPageAvatars = getAssets().list("publicpage_avatar");
			mPhotosName = getAssets().list("photo");
			mViewedName = getAssets().list("viewed");
			mViewedHotName = getAssets().list("viewed_hot");
			mGiftsName = getAssets().list("gifts");
		} catch (IOException e) {
			e.printStackTrace();
		}*/
		/**
		 * 初始化表情名称
		 */
		for (int i = 0; i < mFaces.length; i++) {
			mFacesText.add("[face_" + i + "]");
		}
	}

	/**
	 * 根据壁纸编号获取壁纸
	 */
	public Bitmap getWallpager(int position) {
		try {
			String wallpagerName = mWallpagersName[position];
			Bitmap bitmap = null;
			if (mWallpagersCache.containsKey(wallpagerName)) {
				SoftReference<Bitmap> reference = mWallpagersCache
						.get(wallpagerName);
				bitmap = reference.get();
				if (bitmap != null) {
					return bitmap;
				}
			}
			bitmap = BitmapFactory.decodeStream(getAssets().open(
					"wallpaper/" + wallpagerName));
			mWallpagersCache.put(wallpagerName, new SoftReference<Bitmap>(
					bitmap));
			return bitmap;

		} catch (Exception e) {
			return mDefault_Wallpager;
		}
	}

	/**
	 * 根据壁纸编号获取标题壁纸
	 */
	public Bitmap getTitleWallpager(int position) {
		try {
			String titleWallpagerName = mTitleWallpagersName[position];
			Bitmap bitmap = null;
			if (mTitleWallpagersCache.containsKey(titleWallpagerName)) {
				SoftReference<Bitmap> reference = mTitleWallpagersCache
						.get(titleWallpagerName);
				bitmap = reference.get();
				if (bitmap != null) {
					return bitmap;
				}
			}
			bitmap = BitmapFactory.decodeStream(getAssets().open(
					"title_wallpager/" + titleWallpagerName));
			mTitleWallpagersCache.put(titleWallpagerName,
					new SoftReference<Bitmap>(bitmap));
			return bitmap;
		} catch (Exception e) {
			return mDefault_TitleWallpager;
		}
	}

	/**
	 * 根据图片名称获取主页图片
	 */
	public Bitmap getHome(String photo) {
		try {
			String homeName = photo + ".jpg";
			Bitmap bitmap = null;
			if (mHomeCache.containsKey(homeName)) {
				SoftReference<Bitmap> reference = mHomeCache.get(homeName);
				bitmap = reference.get();
				if (bitmap != null) {
					return bitmap;
				}
			}
			bitmap = BitmapFactory.decodeStream(getAssets().open(
					"home/" + homeName));
			mHomeCache.put(homeName, new SoftReference<Bitmap>(bitmap));
			return bitmap;
		} catch (Exception e) {
			return BitmapFactory.decodeResource(getResources(),
					R.drawable.picture_default_fg);
		}
	}

	/**
	 * 根据编号获取用户圆形头像
	 */
	public Bitmap getAvatar(int position) {
		try {
			String avatarName = mAvatars[position];
			Bitmap bitmap = null;
			if (mAvatarCache.containsKey(avatarName)) {
				SoftReference<Bitmap> reference = mAvatarCache.get(avatarName);
				bitmap = reference.get();
				if (bitmap != null) {
					return bitmap;
				}
			}
			bitmap = PhotoUtil.toRoundCorner(
					BitmapFactory.decodeStream(getAssets().open(
							"avatar/" + avatarName)), 15);
			mAvatarCache.put(avatarName, new SoftReference<Bitmap>(bitmap));
			return bitmap;
		} catch (Exception e) {
			return mDefault_Avatar;
		}
	}

	/**
	 * 根据编号获取用户默认头像
	 */
	public Bitmap getDefaultAvatar(int position) {
		try {
			String avatarName = mAvatars[position];
			Bitmap bitmap = null;
			if (mDefaultAvatarCache.containsKey(avatarName)) {
				SoftReference<Bitmap> reference = mDefaultAvatarCache
						.get(avatarName);
				bitmap = reference.get();
				if (bitmap != null) {
					return bitmap;
				}
			}
			bitmap = BitmapFactory.decodeStream(getAssets().open(
					"avatar/" + avatarName));
			mDefaultAvatarCache.put(avatarName, new SoftReference<Bitmap>(
					bitmap));
			return bitmap;
		} catch (Exception e) {
			return BitmapFactory
					.decodeResource(getResources(), R.drawable.head);
		}
	}

	/**
	 * 根据编号获取公共主页头像
	 */
	public Bitmap getPublicPageAvatar(int position) {
		try {
			String avatarName = mPublicPageAvatars[position];
			Bitmap bitmap = null;
			if (mPublicPageAvatarCache.containsKey(avatarName)) {
				SoftReference<Bitmap> reference = mPublicPageAvatarCache
						.get(avatarName);
				bitmap = reference.get();
				if (bitmap != null) {
					return bitmap;
				}
			}
			bitmap = PhotoUtil.toRoundCorner(
					BitmapFactory.decodeStream(getAssets().open(
							"publicpage_avatar/" + avatarName)), 15);
			mPublicPageAvatarCache.put(avatarName, new SoftReference<Bitmap>(
					bitmap));
			return bitmap;
		} catch (Exception e) {
			return mDefault_Avatar;
		}
	}

	/**
	 * 根据编号获取照片
	 */
	public Bitmap getPhoto(int position) {
		try {
			String photosName = mPhotosName[position];
			Bitmap bitmap = null;
			if (mPhotoCache.containsKey(photosName)) {
				SoftReference<Bitmap> reference = mPhotoCache.get(photosName);
				bitmap = reference.get();
				if (bitmap != null) {
					return bitmap;
				}
			}
			bitmap = BitmapFactory.decodeStream(getAssets().open(
					"photo/" + photosName));
			mPhotoCache.put(photosName, new SoftReference<Bitmap>(bitmap));
			return bitmap;
		} catch (Exception e) {
			return mDefault_Photo;
		}
	}

	/**
	 * 根据编号获取转帖图片
	 */
	public Bitmap getViewed(int position) {
		try {
			String viewedName = mViewedName[position];
			Bitmap bitmap = null;
			if (mViewedCache.containsKey(viewedName)) {
				SoftReference<Bitmap> reference = mViewedCache.get(viewedName);
				bitmap = reference.get();
				if (bitmap != null) {
					return bitmap;
				}
			}
			bitmap = BitmapFactory.decodeStream(getAssets().open(
					"viewed/" + viewedName));
			mViewedCache.put(viewedName, new SoftReference<Bitmap>(bitmap));
			return bitmap;
		} catch (Exception e) {
			return BitmapFactory.decodeResource(getResources(),
					R.drawable.picture_default_fg);
		}
	}

	/**
	 * 根据编号获取热门转帖图片
	 */
	public Bitmap getViewedHot(int position) {
		try {
			String viewedHotName = mViewedHotName[position];
			Bitmap bitmap = null;
			if (mViewedHotCache.containsKey(viewedHotName)) {
				SoftReference<Bitmap> reference = mViewedHotCache
						.get(viewedHotName);
				bitmap = reference.get();
				if (bitmap != null) {
					return bitmap;
				}
			}
			bitmap = BitmapFactory.decodeStream(getAssets().open(
					"viewed_hot/" + viewedHotName));
			mViewedHotCache.put(viewedHotName,
					new SoftReference<Bitmap>(bitmap));
			return bitmap;
		} catch (Exception e) {
			return BitmapFactory.decodeResource(getResources(),
					R.drawable.picture_default_fg);
		}
	}

	/**
	 * 根据编号名称获取游戏图片
	 */
	public Bitmap getRecommend(String position) {
		try {
			String recommendName = "icon_" + position + ".jpg";
			Bitmap bitmap = null;
			if (mRecommendCache.containsKey(recommendName)) {
				SoftReference<Bitmap> reference = mRecommendCache
						.get(recommendName);
				bitmap = reference.get();
				if (bitmap != null) {
					return bitmap;
				}
			}
			bitmap = BitmapFactory.decodeStream(getAssets().open(
					"recommend/" + recommendName));
			mRecommendCache.put(recommendName,
					new SoftReference<Bitmap>(bitmap));
			return bitmap;
		} catch (Exception e) {
			return null;
		}
	}

	/**
	 * 根据图片名称获取附近照片的图片
	 */
/*	public Bitmap getNearbyPhoto(String position) {
		try {
			String nearbyPhotoName = position + ".jpg";
			Bitmap bitmap = null;
			if (mNearbyPhoto.containsKey(nearbyPhotoName)) {
				SoftReference<Bitmap> reference = mNearbyPhoto
						.get(nearbyPhotoName);
				bitmap = reference.get();
				if (bitmap != null) {
					return bitmap;
				}
			}
			bitmap = BitmapFactory.decodeStream(getAssets().open(
					"nearby_photo/" + nearbyPhotoName));
			mNearbyPhoto
					.put(nearbyPhotoName, new SoftReference<Bitmap>(bitmap));
			return bitmap;
		} catch (Exception e) {
			return BitmapFactory.decodeResource(getResources(),
					R.drawable.lbs_checkin_photo_icon);
		}
	}*/

	/**
	 * 根据编号获取表情图片
	 */
	public Bitmap getFaceBitmap(int position) {
		try {
			String faceName = mFacesText.get(position);
			Bitmap bitmap = null;
			if (mFaceCache.containsKey(faceName)) {
				SoftReference<Bitmap> reference = mFaceCache.get(faceName);
				bitmap = reference.get();
				if (bitmap != null) {
					return bitmap;
				}
			}
			bitmap = BitmapFactory.decodeResource(getResources(),
					mFaces[position]);
			mFaceCache.put(faceName, new SoftReference<Bitmap>(bitmap));
			return bitmap;
		} catch (Exception e) {
			return null;
		}
	}

	/**
	 * 根据礼物编号获取礼物图片
	 */
/*	public Bitmap getGift(String gid) {
		try {
			Bitmap bitmap = null;
			if (mGiftsCache.containsKey(gid)) {
				SoftReference<Bitmap> reference = mGiftsCache.get(gid);
				bitmap = reference.get();
				if (bitmap != null) {
					return bitmap;
				}
			}
			bitmap = BitmapFactory.decodeStream(getAssets()
					.open("gifts/" + gid));
			mGiftsCache.put(gid, new SoftReference<Bitmap>(bitmap));
			return bitmap;
		} catch (Exception e) {
			return BitmapFactory.decodeResource(getResources(),
					R.drawable.gifts_default_01);
		}
	}*/

	/**
	 * 根据地址获取手机SD卡图片
	 */
	public Bitmap getPhoneAlbum(String path) {
		Bitmap bitmap = null;
		if (mPhoneAlbumCache.containsKey(path)) {
			SoftReference<Bitmap> reference = mPhoneAlbumCache.get(path);
			bitmap = reference.get();
			if (bitmap != null) {
				return bitmap;
			}
		}
		bitmap = BitmapFactory.decodeFile(path);
		mPhoneAlbumCache.put(path, new SoftReference<Bitmap>(bitmap));
		return bitmap;
	}
}

